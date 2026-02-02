export default function LandingPage() {
  return (
    <main
      className="min-h-screen relative flex text-slate-200"
      style={{
        backgroundImage: "url('/assets/images/background.jpg')",
        backgroundSize: "cover",
        backgroundPosition: "center",
        backgroundRepeat: "no-repeat",
      }}
    >
      {/* Dark Overlay */}
      <div className="absolute inset-0 bg-black/70" />

      {/* Content Wrapper */}
      <div className="relative z-10 flex w-full">
        {/* LEFT SECTION */}
        <section className="hidden md:flex w-3/5 flex-col justify-center px-18">
          <h1 className="text-7xl font-bold mb-4">
            <span className="text-amber-400">Bullion</span>-Broker
          </h1>

          <p className="text-xl text-slate-400 mb-6 max-w-xl">
            A mock gold & silver trading platform built to learn real-world
            onboarding flows, BFF architecture, and end-to-end product design.
          </p>

          <ul className="space-y-3 text-slate-400">
            <li>• Virtual Gold & Silver trading</li>
            <li>• Realistic onboarding & KYC flows</li>
            <li>• Frontend + BFF driven architecture</li>
          </ul>
        </section>

        {/* RIGHT SECTION */}
        <section className="w-full md:w-2/5 flex items-center justify-center px-6">
          <div className="w-full max-w-md bg-slate-900/90 backdrop-blur border border-slate-800 rounded-xl p-8 shadow-2xl">
            <h2 className="text-2xl font-semibold mb-6 text-center">
              Login to continue
            </h2>

            <form className="space-y-4">
              <div>
                <label className="block text-sm mb-1 text-slate-400">
                  Username
                </label>
                <input
                  type="text"
                  placeholder="Enter username"
                  className="w-full px-4 py-2 rounded-md bg-slate-950 border border-slate-800 focus:outline-none focus:ring-2 focus:ring-amber-400"
                />
              </div>

              <div>
                <label className="block text-sm mb-1 text-slate-400">
                  Password
                </label>
                <input
                  type="password"
                  placeholder="Enter password"
                  className="w-full px-4 py-2 mb-2 rounded-md bg-slate-950 border border-slate-800 focus:outline-none focus:ring-2 focus:ring-amber-400"
                />
              </div>

              <div>
                <button
                  type="button"
                  className="w-full bg-amber-400 text-slate-950 font-semibold py-2 rounded-md hover:bg-amber-300 transition"
                >
                  Continue
                </button>
              </div>
            </form>

            {/* Divider */}
            <div className="flex items-center my-6">
              <div className="grow border-t border-slate-800" />
              <span className="px-3 text-sm text-slate-500">or</span>
              <div className="grow border-t border-slate-800" />
            </div>

            {/* Signup option */}
            <p className="text-sm text-center text-slate-400">
              New to Bullion-Broker?{" "}
              <button
                type="button"
                className="text-amber-400 hover:underline font-medium"
              >
                Sign up
              </button>
            </p>

            <p className="text-xs text-slate-500 text-center mt-6">
              By continuing, you agree to our Terms & Privacy Policy
            </p>
          </div>
        </section>
      </div>
    </main>
  );
}
